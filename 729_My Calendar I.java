class MyCalendar {


    TreeMap<Integer,Integer> calendar;
    public MyCalendar() {
        calendar = new TreeMap<>();
    }
    
    
    public boolean book(int start, int end) {
        end = end - 1;
        
        Integer pre = calendar.floorKey(start);
        
        if (pre != null && calendar.get(pre) >= start){
            return false;
        }
        
        Integer post = calendar.ceilingKey(start);
        if (post != null && end >= post){
            return false;
        }
        calendar.put(start,end);
        
        return true;
    }
    
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
