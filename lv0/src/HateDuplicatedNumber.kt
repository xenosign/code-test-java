import kotlin.collections.ArrayList

class HateDuplicatedNumber {
    fun solution(arr: IntArray): IntArray? {
        val tempList = ArrayList<Int?>()
        tempList.add(arr[0])

        for (i in 1..<arr.size) {
            if (arr[i] != tempList.get(tempList.size - 1)) {
                tempList.add(arr[i])
            }
        }

        val answer = tempList.stream().mapToInt { obj: Int? -> obj!!.toInt() }.toArray()

        return answer
    }
}
