// JavaScript code for calculator logic

let currentOperand = '0';
let previousOperand = '';
let operation = undefined;
let resetScreen = false;

function setElements(currentId, previousId) {
    window.currentOperandElement = document.getElementById(currentId);
    window.previousOperandElement = document.getElementById(previousId);
}

function appendNumber(number) {
    if (currentOperand === '0' || resetScreen) {
        currentOperand = '';
        resetScreen = false;
    }
    if (number === '.' && currentOperand.includes('.')) return;
    currentOperand += number;
    updateDisplay();
}

function appendDecimal() {
    if (resetScreen) {
        currentOperand = '0.';
        resetScreen = false;
        updateDisplay();
        return;
    }
    if (currentOperand.includes('.')) return;
    if (currentOperand === '') {
        currentOperand = '0.';
    } else {
        currentOperand += '.';
    }
    updateDisplay();
}

function appendOperator(op) {
    if (currentOperand === '' && previousOperand === '') return;
    if (currentOperand === '' && op === '-') {
        currentOperand = '-';
        updateDisplay();
        return;
    }
    if (currentOperand === '-') return;
    
    if (previousOperand !== '') {
        calculate();
    }
    operation = op;
    previousOperand = currentOperand;
    currentOperand = '';
    updateDisplay();
}

function calculate() {
    let computation;
    const prev = parseFloat(previousOperand);
    const current = parseFloat(currentOperand);
    
    if (isNaN(prev) || isNaN(current)) return;
    
    switch (operation) {
        case '+':
            computation = prev + current;
            break;
        case '-':
            computation = prev - current;
            break;
        case '*':
            computation = prev * current;
            break;
        case '/':
            computation = prev / current;
            break;
        default:
            return;
    }
    
    currentOperand = computation.toString();
    operation = undefined;
    previousOperand = '';
    resetScreen = true;
    updateDisplay();
}

function clearDisplay() {
    currentOperand = '0';
    previousOperand = '';
    operation = undefined;
    updateDisplay();
}

function deleteLastChar() {
    if (currentOperand.length === 1 || (currentOperand.length === 2 && currentOperand.startsWith('-'))) {
        currentOperand = '0';
    } else {
        currentOperand = currentOperand.slice(0, -1);
    }
    updateDisplay();
}

function updateDisplay() {
    if (typeof currentOperandElement !== 'undefined' && typeof previousOperandElement !== 'undefined') {
        currentOperandElement.textContent = currentOperand;
        if (operation != null) {
            previousOperandElement.textContent = `${previousOperand} ${operation}`;
        } else {
            previousOperandElement.textContent = previousOperand;
        }
    }
}

// Keyboard support
document.addEventListener('keydown', (e) => {
    if (e.key >= '0' && e.key <= '9') appendNumber(e.key);
    else if (e.key === '.') appendDecimal();
    else if (e.key === '+' || e.key === '-' || e.key === '*' || e.key === '/') {
        appendOperator(e.key);
    }
    else if (e.key === 'Enter' || e.key === '=') calculate();
    else if (e.key === 'Escape') clearDisplay();
    else if (e.key === 'Backspace') deleteLastChar();
});
