class TVLED extends TV{
int resolusi = 360;
   public void gantiResolusi(int nResolusi){
	if(nResolusi == 1){
		resolusi = 144;
	}else if(nResolusi == 2){
		resolusi = 240;
	}else if(nResolusi == 3){
		resolusi = 360;
	}else if(nResolusi == 4){
		resolusi = 480;
	}else{
		resolusi = 144;
	}
   }
}
