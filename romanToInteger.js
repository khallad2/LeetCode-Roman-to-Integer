/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let map = { "I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000 };
    let score = 0;
    let endPos = s.length -1;
    if (s.length < 1 || s.length > 15) return 0;
    
    for (let i = 0; i< s.length; i++){
        if(map[s[i]] == undefined) return 0;
        if(i < endPos){
            if(map[s[i]] >= map[s[i+1]]){
                score += map[s[i]];
            }
            if(map[s[i]] < map[s[i+1]]) {
                let res = map[s[i+1]] - map[s[i]];
                score += res;
                i +=1;
            }
        } else {
            score += map[s[i]];
        }
    }
    return score;
};romanToInt("LVIII")
