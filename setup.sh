echo -e '.separator "," \n.import src/main/resources/NYSE.csv stocks' | sqlite3 src/main/resources/stocks.db;
echo -e '.separator "," \n.import src/main/resources/NASDAQ.csv stocks' | sqlite3 src/main/resources/stocks.db;
echo -e '.separator "," \n.import src/main/resources/AMEX.csv stocks' | sqlite3 src/main/resources/stocks.db;
