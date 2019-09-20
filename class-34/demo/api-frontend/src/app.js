import React, {useState, useEffect} from 'react';
import './app.scss';


function App() {

  // For uploads
  let form = new FormData();

  // For the JSON version of the form
  const [formData, setFormData] = useState({});

  // const API = 'http://localhost:5000/api/v1';
  // const API = 'https://4z32mw63cd.execute-api.us-west-2.amazonaws.com/dev';
  // const API = 'https://hm9km0yym8.execute-api.us-west-2.amazonaws.com/default/magicAPI?TableName=people';

  function _handleChangeForUpload(event) {
    let value = event.target.files ? event.target.files[0] : event.target.value;
    form.set(event.target.name, value);
  }
  function _handleUpload(event) {
    event.preventDefault();
    fetch(`${API}/upload`, {
      method: "POST",
      mode: 'cors',
      body: form
    })
    .then(response => response.json())
    .catch(error => console.error('Error:', error))
    .then(response => console.log('Success:', response));
  }

  function _handleChange(event) {
    setFormData( {...formData, [event.target.name]:event.target.value});
  }

  function _handleSubmit(event) {
    event.preventDefault();
    fetch(`${API}/people`, {
      method: "POST",
      headers: {'Content-Type': 'application/json'},
      mode: 'cors',
      body: JSON.stringify(formData),
    })
    .then(response => response.json())
    .catch(error => console.error('Error:', error))
    .then(response => console.log('Success:', response));
  }

  useEffect( () => {
    fetch(API, {mode:'cors'})
      .then(data => data.json())
      .then(people => {console.log(people)})
      .catch(console.error);
  });

  return (
    <div className="App">
      <h2>Form - Direct Submit (Multipart)</h2>
      <form onSubmit={_handleUpload} action={API} method="post" encType="multipart/form-data">
        <label>
          <span>What is your name?</span>
          <input onChange={_handleChangeForUpload} name="name" placeholder="name" />
        </label>
        <label>
          <span>What is your age?</span>
          <input onChange={_handleChangeForUpload} name="age" type="text" placeholder="age" />
        </label>
        <label>
          <span>Upload Image</span>
          <input onChange={_handleChangeForUpload} name="file" type="file" />
        </label>
        <button>Save</button>
      </form>

        <h2>Form - JSON Submit</h2>
        <form onSubmit={_handleSubmit}>
          <label>
            <span>What is your name?</span>
            <input onChange={_handleChange} name="name" placeholder="name" />
          </label>
          <label>
            <span>What is your age?</span>
            <input onChange={_handleChange} name="age" type="text" placeholder="age" />
          </label>
          <button>Save</button>
        </form>

    </div>
  );
}

export default App;
