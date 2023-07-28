package tj.code;

 class NaturalScience {
    public void Study(){
        System.out.println("Natural Science is very import for development");
    }
    class Technology extends NaturalScience{
        private String swDevelopment;
        public void develop(){
            System.out.println("Development is the fantastic work of technology");
        }
    }

     public static void main(String[] args) {
         NaturalScience ns=new NaturalScience();

         ns.Study();

     }

}
