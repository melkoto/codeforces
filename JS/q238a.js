const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', (input) => {
    const numbers = input.split(' ').map((number) => parseInt(number))
    const set = new Set(numbers)
    console.log(4 - set.size)
    rl.close();
});
