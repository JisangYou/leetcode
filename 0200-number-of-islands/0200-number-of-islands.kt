class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        if (grid.isEmpty()) return 0

        var count = 0
        val row: Int = grid.count()
        val col: Int = grid[0].count()

        //Move in Four Directions

        //Move in Four Directions
        val directions = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(-1, 0), intArrayOf(0, -1))
        val qu: Queue<IntArray> = LinkedList()

        for (i in 0 until row) {
            for (j in 0 until col) {
                if (grid[i][j] == '1') {
                    count++
                    qu.add(intArrayOf(i, j))

                    //Mark as visited
                    grid[i][j] = '2'
                    while (!qu.isEmpty()) {
                        val curr = qu.poll()
                        for (dir in directions) {
                            val r = curr[0] + dir[0]
                            val c = curr[1] + dir[1]
                            if (r in 0 until row && c >= 0 && c < col && grid[r][c] == '1') {
                                qu.add(intArrayOf(r, c))
                                grid[r][c] = '2'
                            }
                        }
                    }
                }
            }
        }

    return count
    }
}