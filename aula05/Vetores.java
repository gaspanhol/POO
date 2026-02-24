void main(){


    //O vetor é utilizado quando queremos agrupar diversas informações do mesmo tipo
    //Um vetor em java é um objeto

    //Sintaxe de vetores unidimensionais:
    // int[] vet = new int[5];
    // vet[0] = 10;
    // vet[4] = 90;
    // int[] outra = {3, 4, 5, 8};

    //Sintaxe de vetores multidimensional
    //int[][] matriz = new int[3][2]; //lin,col
    //matriz[2][1] = 50; //ultima linha da matriz

    //---Atividade:---
    //1) Vetor de 100 posições e eu quero que iniciem ele com ímpares, começando em 3

    //questão resolvida de forma longa
    // int[] vetor = new int[100];
    // int num = 3;
    // for (int i=0; i<100; i++){
    //     if(num%2 == 0){
    //         num++;
    //     }
    //     vetor[i] = num;
    //     System.out.println(vetor[i]);
    //     num++;
    // }

    //questão resolvida de forma curta
    int[] vetor2 = new int[100];
    vetor2[0] = 3;
    System.out.println(vetor2[0]);
    for (int i = 1; i < vetor2.length; i++){
        vetor2[i] = vetor2[i-1] + 2; 
        System.out.println(vetor2[i]);
    }

    //2) imprima na tela:
    //1 2 3
    //4 5 6
    //7 8 9
    int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    for (int i = 0; i < 3; i++) {
        System.out.println();
        for (int j = 0; j < 3; j++) {
            System.out.print(matriz[i][j] + " ");
        }
    }
    System.out.println();

    //3) imprima na tela:
    // 1
    //    5
    //       9
        int[][] matriz2 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    for (int i = 0; i < 3; i++) {
        System.out.println();
        for (int j = 0; j < 3; j++) {
            if(i == j){
            System.out.print(matriz2[i][j]);
            }else{
                System.out.print(" ");
            }
        }
    }
    System.out.println();

    //Outra opção de código:
    int[][] matriz3 = new int [3][3];
    int contador = 1;
    for (int i = 0; i < 3; i++) {
        System.out.println();
        for (int j = 0; j < 3; j++) {
            matriz3[i][j] = contador++;
            System.out.print(matriz3[i][j]+ " ");
        }
    }
    System.out.println();

    //---Usando for-each para percorrer um vetor---
    int[] vetor3 = {4, 7, 20, 400};

    for (int i = 0; i < vetor3.length; i++) {
        System.out.println(vetor3[i]);
    }

    for (int num : vetor3) {
        System.out.println(num);
    }

    // Usando for-each para percorrer uma matriz
    int[][] matriz4 = {
        {1, 2, 3},
        {4, 5, 6}
    };

    //usando for tradicional
    for (int i = 0; i < matriz4.length; i++) {
        for (int j = 0; j < matriz4.length; j++) {
            System.out.println(matriz4[i][j]);
        }
    }

    //usando for-each
    for (int[] linha : matriz4) {
        for (int valor : linha) {
            System.out.println(valor);
        }
    }

    //---Usando a classe Math.---
    
    int i = -10;
    int j = Math.abs(i);
    System.out.println(j);
    //OBS: quando colocamos Math. aparecem todos os métodos da classe Math, e caso você coloque o mouse na setinha no final da linha você consegue ver a documentação.

}