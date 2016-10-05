public class Main {

    public static void main(String[] args) throws Exception {
       String request = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20" +
                "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys";

        String result = UrlToString.performRequest(request);
        System.out.println(result);
        System.out.println(UnmarshallToString.unmarshallToString(result));

    }


}
