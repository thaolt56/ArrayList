package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSV {
	
	private ArrayList<SinhVien> danhSach;
	
	public DanhSachSV() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSV(ArrayList<SinhVien> danhSach) {
		
		this.danhSach = danhSach;
	}
	
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}
	
	public void danhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien.toString());
		}
	}
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();	
	}
	
	public int soLuongSinhVien() {
		return this.danhSach.size();
	}
	
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}
	
	public boolean kiemTraTonTaiSv(SinhVien sv) {
		return 	this.danhSach.contains(sv);
	}
	public void xoaSv(SinhVien sv) {
		this.danhSach.remove(sv);
	}
	
	public void timSv(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if(sinhVien.getHoTen().indexOf(ten)>=0) {
				System.out.println(sinhVien.toString());
			}
		}
	}
	
	public void sapXepSVTheoDiemTB() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				if(o1.getDiemTB()> o2.getDiemTB()) {
					return 1;
				}else if(o1.getDiemTB()< o2.getDiemTB()) {
					return -1;
				}else {
					return 0;
				}
			}
			
		});
	}
}
