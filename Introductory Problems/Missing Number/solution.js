const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('', (nInput) => {
    const n = parseInt(nInput);

    rl.question('', (seenInput) => {
        const seen = new Set(seenInput.split(" ").map(Number));

        for (let i = 1; i <= n; i++) {
            if (!seen.has(i)) {
                console.log(i);
                break;
            }
        }

        rl.close();
    });
});
