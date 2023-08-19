const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.question('', (input) => {
    let n = parseInt(input);
    while (true) {
        process.stdout.write(n+' ');
        if (n == 1) break;
        else if (n % 2 == 0) n = Math.floor(n / 2);
        else n = n * 3 + 1;
    }
    rl.close();
});

