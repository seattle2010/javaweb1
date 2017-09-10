//import org.apache.commons.fileupload.FileItem;
//import org.apache.commons.fileupload.FileItemFactory;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
//@WebServlet(name = "FileUploadServlet", urlPatterns = "/FileUploadServlet")
//public class FileUploadServlet extends HttpServlet {
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out = response.getWriter();
//        //=============================================
//try{
//    //1创建FileItemFactory对象
//        //FileItemFactory是用来创建FileItem对象的
//        //FileItem对象 ：form表单中的表单控件的封装
//    FileItemFactory factory = new DiskFileItemFactory();
//    //2 创建文件上传处理器
//    ServletFileUpload upload = new ServletFileUpload();
//    //3 解析请求
//    List<FileItem> items = upload.parseRequest(request);
//    // 4 迭代出每一个FileItem
//    for(FileItem item:items){
//        String fieldName = item.getFieldName(); //获取表单控件的name属性值（参数名）
//        if (item.isFormField()) {
//            //普通表单控件
//            String value = item.getString("UTF-8");
//            System.out.println(fieldName + "-" + item.getName());
//
//        } else {
//            System.out.println(fieldName + "-" + item.getName());
//            item.write(new File("D:/",item.getName()));//把二进制数据写到哪一个文件中
//        }
//    }
//}catch(Exception e){
//    e.printStackTrace();
//}
//    }
//
//}
