package com.freesoft.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploadServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1591009707342895786L;

	@SuppressWarnings({ "deprecation", "unchecked" })
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getRealPath("/upload");
		
		// Check that we have a file upload request
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		
		if (isMultipart) {
			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setRepository(new File(path));
			factory.setSizeThreshold(1024*1024);
			
			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setHeaderEncoding("UTF-8");
			// Parse the request
			try {
				List<FileItem> items = (List<FileItem>)upload.parseRequest(request);
				for(FileItem item: items) {
					// general parameter
					String param = item.getFieldName();
					if (item.isFormField()) {
						String value = item.getString("UTF-8");
						System.out.println("Param: " + param + "; Value: " + value);
					} else {
						// is file
						String file = item.getName();
						System.out.println(file);
						String filename = new File(file).getName();
						request.setAttribute("fileupload", filename);
						// item.getInputStream();
						item.write(new File(path, filename));
					}
				}
			} catch (FileUploadException e) {
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.getRequestDispatcher("/result.jsp").forward(request, response);
		}
	}

}
