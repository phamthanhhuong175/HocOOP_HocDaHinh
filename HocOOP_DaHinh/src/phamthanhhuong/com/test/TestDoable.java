package phamthanhhuong.com.test;

import phamthanhhuong.com.model.IDoable;
import phamthanhhuong.com.model.NhanVien;
import phamthanhhuong.com.model.SinhVien;

public class TestDoable {

	public static void main(String[] args) {
		IDoable x;
		x=new NhanVien();
		x.doSomething();
		x=new SinhVien();
		x.doSomething();
	}

}
