import React, {useState} from 'react';
import './app.css';

let form = new FormData();

function App() {

  const API = 'http://localhost:5000/api/v1/person';


  function _handleChange(event) {
    let value = event.target.files ? event.target.files[0] : event.target.value;
    form.set(event.target.name, value);
  }

  function _upload(event) {
    event.preventDefault();
    fetch(API, {
      method: "POST",
      mode: 'no-cors',
      body: form,
    })
    .then(response => response.json())
    .catch(error => console.error('Error:', error))
    .then(response => console.log('Success:', response));
  }

  return (
    <div className="App">
      <form onSubmit={_upload} action={API} method="post" encType="multipart/form-data">
        <label>
          <input onChange={_handleChange} name="name" placeholder="name" />
        </label>
        <label>
          <div>Are You Old?</div>
          <input onChange={_handleChange} name="old" type="radio" value="true" /><span>Yes</span>
          <input onChange={_handleChange} name="old" type="radio" value="false" /><span>No</span>
        </label>
        <label>
          <span>Upload Image</span>
          <input onChange={_handleChange} name="file" type="file" />
        </label>
        <button>Save</button>
      </form>
    </div>
  );
}

export default App;
