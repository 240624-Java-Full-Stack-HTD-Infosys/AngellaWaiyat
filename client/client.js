function sendRequest() {
    const url = 'http://localhost:8080/users';
    const firstname = document.getElementById('firstname').value;
    const lastnmae = document.getElementById('lastname').value;
    const age = document.getElementById('age').value;
    const data = {
        name: firstname + ' ' + lastnmae,
        age: parseInt(age)
    };
    fetch(url, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById('response').textContent = JSON.stringify(data);
    })
    .catch(error => console.error('Error:', error));
}