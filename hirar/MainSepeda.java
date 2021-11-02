class MainSepeda
{
  public static void main(String args[])
  {
     SepedaListrik sl = new SepedaListrik();
     SepedaGunung sg = new SepedaGunung();
     SepedaTouring st = new SepedaTouring();
	 
	 sl.mesinOn();
     sl.tambahKecepatan(ekecepatan);
     sl.kurangiKecepatan(ekecepatan);
     sl.rem();
	 sl.mesinOff();
	 
	 sg.tambahKecepatan(ekecepatan);
     sg.kurangiKecepatan(ekecepatan);
	 sg.gantiGir(egir);
     sg.rem();
	 
	 st.lightOn();
	 st.tambahKecepatan(ekecepatan);
     st.kurangiKecepatan(ekecepatan);
     st.rem();
	 st.lightOff();
  }
}