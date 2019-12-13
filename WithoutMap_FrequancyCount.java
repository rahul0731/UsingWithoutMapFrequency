package Important.Strings;

public class WithoutMap_FrequancyCount {
	public static void main(String[] args) {
		String str = "If you are interested, you can find a more exhaustive list on separate blog pots, which I have listed in the further learning section. Anyway, let's go through this Java Developer RoadMap to understand how to become a Java developer in 2019.Btw, you by no means need to understand everything on this roadmap to become a rockstar developer. In fact, you don’t even need to take them that seriously if you don’t want to. Instead, use these maps as a starting point to help guide your learning as you go.";
		String sr[] =str.split("[\\s@&.,?$+-]+");
		 String[] uniqueKeys;
	        int count = 0;
	        System.out.println(str);
	        uniqueKeys = getUniqueKeys(sr);
	        for(String key: uniqueKeys)
	        {
	            if(null == key)
	            {
	                break;
	            }           
	            for(String s : sr)
	            {
	                if(key.equals(s))
	                {
	                    count++;
	                }               
	            }
	            System.out.println(key+"------>"+count);
	            count=0;
	        }
	    }
	    private static String[] getUniqueKeys(String[] keys)
	    {
	        String[] uniqueKeys = new String[keys.length];
	        uniqueKeys[0] = keys[0];
	        int uniqueKeyIndex = 1;
	        boolean keyAlreadyExists = false;
	        for(int i=1; i<keys.length ; i++)
	        {
	            for(int j=0; j<=uniqueKeyIndex; j++)
	            {
	                if(keys[i].equals(uniqueKeys[j]))
	                {
	                    keyAlreadyExists = true;
	                }
	            }           
	            if(!keyAlreadyExists)
	            {
	                uniqueKeys[uniqueKeyIndex] = keys[i];
	                uniqueKeyIndex++;               
	            }
	            keyAlreadyExists = false;
	        }       
	        return uniqueKeys;
	}

}
