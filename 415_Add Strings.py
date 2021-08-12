class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        g={"1":1,"2":2,"3":3,"4":4,"5":5,"6":6,"7":7,"8":8,"9":9,"0":0}
        def str_to_int(num,k,r):
            for i in range(len(num)-1,-1,-1):
                r+=g[num[i]]*k
                k*=10
            return(r)
        return str(str_to_int(num1,1,0)+str_to_int(num2,1,0))
