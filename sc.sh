#Fetching details of all the banks
curl "https://quiet-lowlands-56608.herokuapp.com/banks"


#Fetching details of banks by passing ifsc code
curl "https://quiet-lowlands-56608.herokuapp.com/ifsc?code=ABHY0065002"


#List of Fetching details of banks by passing bank name and city
curl "https://quiet-lowlands-56608.herokuapp.com/bankinfo?bank_name=ABHYUDAYA%20COOPERATIVE%20BANK%20LIMITED&city=MUMBAI"


List of Fetching details of banks by passing bank name and city(limiting the data to 5 data sets)
curl "https://quiet-lowlands-56608.herokuapp.com/bankinfo?bank_name=ABHYUDAYA%20COOPERATIVE%20BANK%20LIMITED&city=MUMBAI&limit=5"


List of Fetching details of banks by passing bank name and city(limiting the data to 10 data sets)
curl "https://quiet-lowlands-56608.herokuapp.com/bankinfo?bank_name=ABHYUDAYA%20COOPERATIVE%20BANK%20LIMITED&city=MUMBAI&limit=10"