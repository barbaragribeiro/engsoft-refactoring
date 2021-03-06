public class HtmlStatement extends Statement {
   public String valueHeader(Customer aCustomer){
      return "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
   }

   public String valueRental(Rental each){
      return each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
   }

   public String valueFooter(Customer aCustomer){
      String footer = "<P>You owe <EM>" +
         String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      footer += "On this rental you earned <EM>" + 
         String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
      return footer;
   }
}
