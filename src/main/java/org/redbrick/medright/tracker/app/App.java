package org.redbrick.medright.tracker.app;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

// import org.redbrick.medright.tracker.domain.Treatment;
import org.redbrick.medright.tracker.utils.DatabaseOps;

/**
 * @author RedBrick
 */
public class App {
	static Connection conn;

	static String whichDB = "login";
	static Boolean status;

	private static DatabaseMetaData md;

	private static ResultSet rs;

	public static void main(String[] args)
			throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

		try {
			conn = DatabaseOps.connectToDB(whichDB);

		} catch (Exception err) {
			System.out.println(err);
		}

		try {
			md = conn.getMetaData();
			rs = md.getColumns(null, "APP", "TREATMENTS", null);
			while (rs.next()) {
				System.out.println(rs.getString(4));
			}
		} catch (Exception err) {
			System.out.println(err);
		}
		rs.close();
		try {
			DatabaseOps.getStateOfDatabase(conn);
		} catch (Exception err) {
			System.out.println(err);

		}

		conn.close();
	}
}
