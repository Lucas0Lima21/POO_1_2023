package sistema_farmacia;

public class Farmacia {
	public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        
        System.out.println("Array original:");
        mostraArray(array);

        insertionSort(array);

        System.out.println("\nArray ordenado:");
        mostraArray(array);
    }
	private static void insertionSort(int[] arrayOriginal) {
		for (int i = 1; i < arrayOriginal.length; i++) {
			int numAtual = arrayOriginal[i];
			int Anterior = i - 1;
			while (Anterior >= 0 && arrayOriginal[Anterior] > numAtual) {
				arrayOriginal[Anterior + 1] = arrayOriginal[Anterior];
				Anterior--;
			}
			arrayOriginal[Anterior + 1] = numAtual;
		}
	}
	
    public static void mostraArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

