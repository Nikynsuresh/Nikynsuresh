function calculateBMI() {
    const weight = parseFloat(document.getElementById('weight').value);
    const height = parseFloat(document.getElementById('height').value);
    if (isNaN(weight) || isNaN(height) || weight <= 0 || height <= 0) {
        document.getElementById('result').textContent = "Please enter valid values.";
        return;
    }
    const bmi = weight / (height ** 2);
    document.getElementById('result').textContent = `Your BMI is: ${bmi.toFixed(2)}`;
}