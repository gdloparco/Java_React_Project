import React, { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
  const [banks, setBanks] = useState([]);
  const [newBank, setNewBank] = useState('');

  useEffect(() => {
    fetchbanks();
    const interval = setInterval(fetchbanks, 1000);
    return () => clearInterval(interval);
  }, []);

  const fetchbanks = async () => {
    try {
      const response = await axios.get('http://localhost:8080/getbanks');
      setBanks(response.data);
    } catch (error) {
      console.error('Error fetching banks:', error);
    }
  };

  const addBank = async () => {
    try {
      await axios.post('http://localhost:8080/addbank', { bankname: newBank });
      setNewBank('');
      fetchbanks();
    } catch (error) {
      console.error('Error adding bank:', error);
    }
  };

  const deleteBank = async (id) => {
    try {
      await axios.delete(`http://localhost:8080/deletebank/${id}`);
      fetchbanks();
    } catch (error) {
      console.error('Error deleting bank:', error);
    }
  };

  return (
    <div className="bg-purple-700 text-white min-h-screen flex flex-col items-center justify-center">
      <h1 className="text-3xl font-bold mb-4">UK Banks</h1>
      <ul className="bg-purple-800 p-4 rounded-lg shadow-lg my-5"
          style={{ display: banks.length === 0 ? "none" : "block" }}
      >
        {banks.map(bank => (
          <li key={bank.id} className="flex items-center justify-between mb-2">
            <span>{bank.bankname}</span>
            <button
              className="bg-yellow-700 hover:bg-yellow-600 text-white py-1 px-2 rounded ml-5"
              onClick={() => deleteBank(bank.id)}
            >
              Remove
            </button>
          </li>
        ))}
      </ul>
      <div className="mt-4">
        <input
          type="text"
          value={newBank}
          onChange={(e) => setNewBank(e.target.value)}
          placeholder="Add a new bank"
          className="px-4 py-2 rounded-lg border-2 text-gray-800 border-purple-700 mr-2"
        />
        <button
          onClick={addBank}
          className="bg-purple-900 hover:bg-purple-800 text-white py-2 px-4 rounded-lg"
        >
          Add Bank
        </button>
      </div>
    </div>
  );
}

export default App;