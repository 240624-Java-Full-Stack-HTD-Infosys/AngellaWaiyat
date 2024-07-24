document.getElementById('userform').addEventListener('submit', sendRequest);

function sendRequest(event) {
    event.preventDefault(); // Prevent the default form submission

    const url = 'http://localhost:8080/users';
    const firstname = document.getElementById('firstname').value;
    const lastname = document.getElementById('lastname').value;
    const age = document.getElementById('age').value;
    const data = {
        firstname: firstname,
        lastname: lastname,
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
        document.getElementById('response').textContent = JSON.stringify(data, null, 2);
    })
    .catch(error => console.error('Error:', error));
}