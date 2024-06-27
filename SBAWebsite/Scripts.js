document.getElementById('reservation-form').addEventListener('submit', function(event) {
  event.preventDefault();
  let name = document.getElementById('name').value;
  let email = document.getElementById('email').value;
  let date = document.getElementById('date').value;
  let time = document.getElementById('time').value;
  
  console.log(`Reservation made for ${name} on ${date} at ${time}`);
  
  alert('Reservation successful!');
});
