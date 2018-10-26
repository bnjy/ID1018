class DenKortasteVagen {

    //metod för att beräkna den kortaste sträckan
    public static int[] mellanstationer (double[] a, double[][] b, double[] c) {

        int[] result = {0,0};
        
        //räknar ut den kortaste sträckan
        //returnerar värden för kortaste sträckan korStra
        double korStra = a[0] + b[0][0] + c[0];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                double nuvStra = a[i] + b[i][j] + c[j];


                if (nuvStra <= korStra) {
                    korStra = nuvStra;
                    result [0] = i;
                    result [1] = j;
                }
            }
        }

        return result;
    }
        //metod för att returnera den kortaste sträckan mellan X och Y
        public static double langd (double[] a, double[][] b, double[] c){
        int[] stations = mellanstationer (a, b, c);
        return a[stations[0]] + b[stations[0]][stations[1]] + c[stations[1]];

        }
}
