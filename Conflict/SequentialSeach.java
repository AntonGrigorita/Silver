public class SequentialSearch {
<<<<<<< HEAD
        public static boolean contains(int[] a, int b){
		for (int i : a) {
=======
        public static boolean contains(long[] a, long b){
                for (int i = 0; i<a.length ; i++) {
>>>>>>> 76eed8cd23088e70e010ccce24455c3788124451
                        if (a[i]==b){
                                return true;
                        }
                }
                return false;
        }
}
