/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        // if (guess(n) == 0) {
        //     return n
        // } else {
        //     return guessNumber(n + guess(n))
        // }
        
        var low = 1
        var high = n
        while (low <= high) {
            var mid = low + (high - low) / 2;
            var res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1
    }
}