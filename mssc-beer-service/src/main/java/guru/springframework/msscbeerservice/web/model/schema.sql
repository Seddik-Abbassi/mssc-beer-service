CREATE TABLE IF NOT EXISTS beer (
                      id VARCHAR(36) NOT NULL,
                      version BIGINT,
                      created_date TIMESTAMP,
                      last_modified_date TIMESTAMP,
                      beer_name VARCHAR(255),
                      beer_style VARCHAR(255),
                      upc VARCHAR(255) UNIQUE,
                      price DECIMAL(19, 2),
                      min_on_hand INTEGER,
                      quantity_to_brew INTEGER,
                      PRIMARY KEY (id)
);
