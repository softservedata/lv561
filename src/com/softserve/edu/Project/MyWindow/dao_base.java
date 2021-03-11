package com.softserve.edu.Project.MyWindow;

	/**
	 * ������� ����� ������ ������� DAO � �������� ��
	 */
	import java.sql.Connection;
	import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

	public abstract class dao_base {
	    protected  String      driver     = null;  // ������� JDBC
	    protected  String      url        = null;  // ������ �����������
		
	    protected  Properties  properties = null;  // �������� ����������� ������� Connection
	    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	    public dao_base(String driver) {
	        this.driver = driver;
	    }
	    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	    /**
	     * ��������� ����������� �������� JDBC
	     */
	    protected void RegisterDriverManager() {
	        try {
	            Class.forName(driver).newInstance();
	        } catch (InstantiationException e) {e.printStackTrace();
	        } catch (IllegalAccessException e) {e.printStackTrace();
	        } catch (ClassNotFoundException e) {e.printStackTrace();}
	    }
	    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	    /**
	     * ��������� ����������� ������ ����������� URL � ������� ��
	     * @param host - ��� ����������
	     * @param database - ������������ �� (����� ���� ������ �������)
	     * @param port - ���� �������
	     */
	    public abstract void setURL (String host, String database, int port);
	    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	    /**
	     * ������� ��������� ������� �����������
	     * @return Connection - ������ �����������
	     */
	    public abstract Connection getConnection ();
	    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	    /**
	     * ��������� ����������� �������� ����������� � ������� ���� JDBC � ����������� �������
	     * @param login - ����� �����������
	     * @param password - ������ �����������
	     */
	    public void Connect (String login, String password) {
	        // ����������� ��������
	        RegisterDriverManager();

	        // ����������� ������� ����������� Connection
	        properties = new Properties();
	        properties.setProperty("password"         , password);
	        properties.setProperty("user"             , login   );
	        properties.setProperty("useUnicode"       , "true"  );
	        properties.setProperty("characterEncoding", "utf8"  );
	    }
	    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	    /**
	     * ��������� ���������� �� ������� ��
	     * @param connection ������ �����������
	     */
	    public void Disconnect (Connection connection) {
	        try {
	            connection.close();
	            connection = null;
	        } catch (SQLException e) {}
	    };
	    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	    /**
	    * ������� �������� �����
	     * @param schema ������������ �����
	     * @return ��������� ����������
	     */
	    public boolean createSchema(final String schema) {
	        return false; 
	    }
	    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	    /**
	     * ������� �������� �����
	     * @param schema ������������ �����
	     * @return ��������� ����������
	     */
	    public boolean dropSchema(final String schema) {
	        return false; 
	    }
	    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	    /**
	     * ������� ���������� SQL-�������
	     * @param sql ����� �������
	     * @return ��������� ���������� �������
	     */
	    public boolean execSQL (final String sql) {
	        boolean result = false;
	        try {
	            if (getConnection() != null) {
	                Statement statement = getConnection().createStatement();
	                statement.execute(sql);
	                statement.close();
	                statement = null;
	                result = true;
	            }
	        } catch (SQLException e) {
	            System.err.println ("SQLException : code = " + String.valueOf(e.getErrorCode()) + 
	                                                       " - " + e.getMessage());
	            System.err.println ("\tSQL : " + sql);
		        
	        }
	        return result;
	    }
	}


