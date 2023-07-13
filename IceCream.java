class IceCream{
	static String iceNames[]={null,null,null,null,null,null};
	static int index;
	public static boolean addIce(String ice ){
	boolean isAdded = false;
	if(ice!= null){
	iceNames[index] = ice;
	index++;
	isAdded = true;
	}else{
	System.out.println("cannot add ");
	}
	return isAdded;
	}
	public static void getAllIce(){
	for(int ice=0;ice<iceNames.length;ice++){
	String ref=iceNames[ice];
	System.out.println(ref);
	}
	}
	public static boolean updateIceName(String existingIceName,String updatedIceName){
		boolean isUpdated=false;
		for(int j=0;j<iceNames.length;j++)
		{
			if(iceNames[j].equals(existingIceName))
			{
			iceNames[j]=updatedIceName;
				isUpdated=true;
			}
		}
		return isUpdated;
	}
	public static boolean deleteIceName(String deletedIceName){
			System.out.println("invoking deleteIceName");
		   
			boolean isDeleted=false;
			int iceIndex;
			int noofElements=index;
	
			for(iceIndex=0; iceIndex<index;iceIndex++){
				if(iceNames[iceIndex].equals(deletedIceName)){
					isDeleted=true;
					break;
				}
			}
	
			if(iceIndex<noofElements){
				noofElements=noofElements-1;
			}
	
			for(int newIceIndex=iceIndex;newIceIndex<noofElements;newIceIndex++){
				iceNames[newIceIndex]=iceNames[newIceIndex+1];
			}
			index--;
			return isDeleted;
	
		}
		
		public static void getAllIceNamePostDeletetion(){
			for(int iceIndex=0;iceIndex<index; iceIndex++){
				System.out.println(iceNames[iceIndex]);
		}
	}
	}