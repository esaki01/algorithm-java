/*
単純挿入法（挿入ソート）.
正しい順序になるようにデータを挿入していき、並べ替える整列アルゴリズム.

POINT
単純挿入法は、次の手順からできている.
- 挿入したいデータを、整列済みデータと順番に比較していく
- 挿入したいデータより小さいデータが見つかったら、その後ろの要素に挿入する
 */
package sorting;

public class InsertionSort {

    public static void sort(int[] data) {
        for (int i = 1; i < data.length; i++) { // 最初は左端の要素を操作済みとみなすのでi=1から始める
            int tmp = data[i]; // 挿入する要素をtmpに代入
            int k;
            for (k = i; k > 0 && data[k - 1] > tmp; k--) {
                data[k] = data[k - 1]; // 左の操作済みの要素と比較し、挿入する要素よりも大きかった場合、入れ替える
            }
            data[k] = tmp; // 空いた要素にデータを挿入する
        }
    }
}
