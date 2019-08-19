	package week8;

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.io.RandomAccessFile;
	import java.io.Serializable;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class JohnNicholsWeek8 extends HttpServlet{
		
		private String target = "localhost:7070";
	//  Database credentials
		static final String USER = "student1";
		static final String PASS = "pass";
		private MyBean bean;
		private CustomTag customTag;

		public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException{

				PrintWriter out = response.getWriter();
				String myNameData = request.getParameter("myName");
				String myAddressData = request.getParameter("myAddress");
				String myCityData = request.getParameter("myCitye");
				bean.setMyNameDAta(myNameData);
				bean.setMyAddressData(myAddressData);
				bean.setMyCityData(myCityData);
				customTag.setBean(bean);
				printHeader(out);
				printForm(out);
				printFooter(out);
				}

				public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException{
				PrintWriter out = response.getWriter();

				printHeader(out);
				writeToDB();
				printFooter(out);
				}

				public void writeToDB() {
					try {
						 System.out.println("Connecting to database.");
						 DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
					     System.out.println("Driver Registered.");
					     
					     //Connect to the URL
					     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@academic3.bellevue.edu:1521:cistap", USER, PASS);
					     System.out.println("Established connection.");
					     //Execute Insert statement
					     Statement insertStatement = con.createStatement();
					     insertStatement.executeUpdate("INSERT INTO ADDRESS " + "(NAME,ADDRESS,CITY)" + "VALUES (" + bean.getMyNameDAta() + "," + bean.getMyAddressData() + "," + bean.getMyCityData() + ")");
		
					     // Execute a SELECT statement
					     Statement selectStatment = con.createStatement();
					     ResultSet rs = selectStatment.executeQuery("SELECT * FROM ADDRESS");
					     
					  	}
						catch(Exception e) {
							System.out.println("Exception while connecting to the database: " + e);
						}
				}
				
				public void printHeader(PrintWriter out){
				out.println("<head>");
				out.println("<title>");
				out.println("Form Post & Get");
				out.println("</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<div>");
				}

				public void printFooter(PrintWriter out){
				out.println("</div>");
				out.println("</body>");
				out.println("</html>");
				}

				public void printForm(PrintWriter out){
					out.println("<jsp:UseBean id='student' class='week8.MyBean' />");
					out.println("<jsp:setProperty name = \"students\" property = \"myName\" value = \"John Nichols\"/>");
					out.println("<jsp:setProperty name = \"students\" property = \"myAddress\" value = \"123 Sesame Street\"/>");
					out.println("<jsp:setProperty name = \"students\" property = \"myCity\" value = \"Omaha\"/>");
					out.println("</jsp:useBean>");
					out.println("<p>MyName: ");
					out.println("<jsp:getProperty name = \"students\" property = \"myName\"/>");
					out.println("</p>");
					out.println("<p>MyName: ");
					out.println("<jsp:getProperty name = \"students\" property = \"myAddress\"/>");
					out.println("</p>");
					out.println("<p>MyName: ");
					out.println("<jsp:getProperty name = \"students\" property = \"myCity\"/>");
					out.println("</p>");
					out.println("<tag>");
					out.println("<name>today</name>");
					out.println("<tag-class>week8.CustomTag</tag-class>");
					out.println("</tag>");
				}
				
	}
