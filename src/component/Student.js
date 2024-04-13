import * as React from 'react';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import Paper from '@mui/material/Paper';

export default function BasicTextFields() {
    const [name,setName] = React.useState('')
    const [address, setAddress]=React.useState('')
    const [students,setStudents]=React.useState([])
    const handleClick=(e)=>{
        e.preventDefault()
        const student= {name,address}
        console.log(student);
    
    fetch("http://localhost:1245/api/v1/student/add",{
        method:"POST",
        headers:{"content-Type":"application/json"},
        body:JSON.stringify(student)
    }).then(()=>{
        console.log("New Student added");
    })
}
React.useEffect(()=>{
  fetch("http://localhost:1245/api/v1/student/read")
  .then(res=>res.json())
  .then((result)=>{
    setStudents(result);
  }
  )
},[])
  return (
    <form
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      
        <h1 style={{color:"blue"}}><u>Add Student</u></h1>
      <TextField id="standard-basic" label="Student Name" variant="standard"
      value={name}
      onChange={(e) => setName(e.target.value)}
      /><br></br>
      <TextField id="standard-basic" label="Student Address" variant="standard" 
      value={address}
      onChange={(e) => setAddress(e.target.value)}
      /><br></br><br></br>
       <Button variant="contained" style={{backgroundColor:"red"}} onClick={handleClick}>Submit</Button>
      
      <div>
        <h1>Students</h1>
        {students.map(student=>(
          <form key={student.id}>
          Id:{student.id}
          Name:{student.name}
          Address:{student.address}
          </form>
        ))}
      </div>
    
      </form>
     
     
  );
}
