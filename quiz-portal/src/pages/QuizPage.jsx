import React from 'react';
import { useParams } from 'react-router-dom';

const QuizPage = () => {
  const { quizId } = useParams();

  return <h1>Quiz Page for Quiz ID: {quizId}</h1>;
};

export default QuizPage;
