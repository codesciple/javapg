public class dnaSequencing {

    public static void main(String[] args) {
        //This program identifies DNA

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna3;

        //Finding start codon
        int start = dna.indexOf("ATG");
        System.out.println("Start = "+ start);

        //Finding stop codon
        int stop = dna.indexOf("TGA");
        System.out.println("Stop = "+ stop);

        if(start != -1 && stop != -1){
            System.out.println("Condition 1 and 2 are satisfied.");
        }
        if(start != -1 && stop != -1 && (stop - start) % 3 == 0){
            String protein = dna.substring(start, stop+3);
            System.out.println("Condition 1 and 2 and 3 are satisfied.");
        }else{
            System.out.println("No Protein");
        }

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

    }

}