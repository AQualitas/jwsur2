<jsp:useBean id    = "preds" 
	     type  = "com.jwsur2.ch1.predictions.Predictions" 
	     class = "com.jwsur2.ch1.predictions.Predictions"> 
  <% 
     String verb = request.getMethod();

     if (!verb.equalsIgnoreCase("GET")) {
       response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED,
                          "GET requests only are allowed.");
     }
     // If it's a GET request, return the predictions.
     else {
       // Object reference application has the value 
       // pageContext.getServletContext()
       preds.setServletContext(application);
       out.println(preds.getPredictions());
     }
  %>
</jsp:useBean>  
