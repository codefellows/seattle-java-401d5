exports.handler = async (event) => {
  // TODO implement
  const response = {
    statusCode: 200,
    body: JSON.stringify({"Event Data":event})
  };
  return response;
};
