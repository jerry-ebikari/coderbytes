function bracketMatcher(str) {
    let difference = 0;
    for (let i = 0; i < str.length; i++) {
        switch (str[i]) {
            case "(":
                difference++;
                break;
            case ")":
                difference--;
                break;
        }
        if (difference < 0) return "0";
    }
    return difference == 0 ? "1" : "0";
}

console.log(bracketMatcher("(coder)(byte))"));
console.log(bracketMatcher("(c(oder)) b(yte)"));