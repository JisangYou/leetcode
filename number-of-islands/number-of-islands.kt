class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var count = 0
        for (i in grid.indices) {
            for (j in 0 until grid[i].count()) {
                if (grid[i][j] == '1') {
                    mark(grid, i, j)
                    count++
                }
            }
        }
        return count
    }
    private fun mark(grid: Array<CharArray>, row: Int, col: Int) {
        grid[row][col] = '-'
        if (row < grid.count() - 1 && grid[row + 1][col] == '1') {
            mark(grid, row + 1, col) // 상
        }
        if (row > 0 && grid[row - 1][col] == '1') {
            mark(grid, row - 1, col) // 하
        }
        if (col > 0 && grid[row][col - 1] == '1') {
            mark(grid, row, col - 1) // 좌
        }
        if (col < grid[row].count() - 1 && grid[row][col + 1] == '1') {
            mark(grid, row, col + 1) //우
        }
    }
}