'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function plusMinus(arr) {
    // Write your code here
    let cntPositive = 0
    let cntNegative = 0
    let cntZero = 0

    for (const i of arr) {
        if (i > 0) cntPositive++;
        else if (i < 0) cntNegative++;
        else cntZero++;
    }

    console.log(parseFloat(cntPositive / arr.length).toFixed(6))
    console.log(parseFloat(cntNegative / arr.length).toFixed(6))
    console.log(parseFloat(cntZero / arr.length).toFixed(6))

}

function main() {
    const n = parseInt(readLine().trim(), 10);

    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    plusMinus(arr);
}
