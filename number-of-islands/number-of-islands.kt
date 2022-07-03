class Solution {
    fun numIslands(islandGrid: Array<CharArray>): Int {
        val h = islandGrid.size
        if (h == 0) return 0
        val l: Int = islandGrid[0].size
        var islands = 0
        val visited = Array(islandGrid.size) {
            BooleanArray(
                islandGrid[0].size
            )
        }

        // 초기화
        for (i in 0 until h) {
            for (j in 0 until l) {
                visited[i][j] = false
            }
        }
        // bfs 시작
        val queue: Queue<String> = LinkedList()
        for (i in 0 until h) {
            for (j in 0 until l) {
                if (!visited[i][j] && islandGrid[i][j] == '1') {
                    queue.add("$i,$j")
                    BFS(queue, islandGrid, visited)
                    islands++
                }
            }
        }
        return islands
    }
    
    fun BFS(queue: Queue<String>, islandGrid: Array<CharArray>, visited: Array<BooleanArray>) {
        val H = islandGrid.size
        val L: Int = islandGrid[0].size
        while (!queue.isEmpty()) {
            val x = queue.remove()
            val row = x.split(",".toRegex()).toTypedArray()[0].toInt()
            val col = x.split(",".toRegex()).toTypedArray()[1].toInt()
            if (row < 0 || 
                col < 0 || 
                row >= H || 
                col >= L || 
                visited[row][col] || 
                islandGrid[row][col] != '1') {
                //nothing to do 
            } else {
                visited[row][col] = true
                queue.add(row.toString() + "," + (col - 1)) //go left
                queue.add(row.toString() + "," + (col + 1)) //go right
                queue.add((row - 1).toString() + "," + col) //go up
                queue.add((row + 1).toString() + "," + col) //go down
            } 
        }
    }
}