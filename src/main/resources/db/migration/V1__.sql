CREATE TABLE pricing_category (
  pricing_category_code VARCHAR(255) NOT NULL,
   pricing_category_name VARCHAR(255) NULL,
   pricing_start_date date NULL,
   pricing_end_date date NULL,
   CONSTRAINT pk_pricing_category PRIMARY KEY (pricing_category_code)
);

CREATE TABLE session (
  id BIGINT AUTO_INCREMENT NOT NULL,
   session_name VARCHAR(255) NULL,
   session_description VARCHAR(255) NULL,
   session_length INT NULL,
   CONSTRAINT pk_session PRIMARY KEY (id)
);

CREATE TABLE session_speakers (
  session_id BIGINT NOT NULL,
   speakers_id BIGINT NOT NULL,
   CONSTRAINT pk_session_speakers PRIMARY KEY (session_id, speakers_id)
);

CREATE TABLE speaker (
  id BIGINT AUTO_INCREMENT NOT NULL,
   first_name VARCHAR(255) NULL,
   last_name VARCHAR(255) NULL,
   title VARCHAR(255) NULL,
   company VARCHAR(255) NULL,
   speaker_bio VARCHAR(255) NULL,
   speaker_photo BLOB NULL,
   CONSTRAINT pk_speaker PRIMARY KEY (id)
);

CREATE TABLE ticket_price (
  id BIGINT AUTO_INCREMENT NOT NULL,
   base_price DECIMAL(19, 2) NULL,
   ticket_type_ticket_type_code VARCHAR(255) NULL,
   pricing_category_pricing_category_code VARCHAR(255) NULL,
   CONSTRAINT pk_ticket_price PRIMARY KEY (id)
);

CREATE TABLE ticket_type (
  ticket_type_code VARCHAR(255) NOT NULL,
   ticket_type_name VARCHAR(255) NULL,
   `description` VARCHAR(255) NULL,
   includes_workshop BIT(1) NULL,
   CONSTRAINT pk_ticket_type PRIMARY KEY (ticket_type_code)
);

ALTER TABLE ticket_price ADD CONSTRAINT FK_TICKET_PRICE_ON_PRICING_CATEGORY_PRICING_CATEGORY_CODE FOREIGN KEY (pricing_category_pricing_category_code) REFERENCES pricing_category (pricing_category_code);

ALTER TABLE ticket_price ADD CONSTRAINT FK_TICKET_PRICE_ON_TICKET_TYPE_TICKET_TYPE_CODE FOREIGN KEY (ticket_type_ticket_type_code) REFERENCES ticket_type (ticket_type_code);

ALTER TABLE session_speakers ADD CONSTRAINT fk_sesspe_on_session FOREIGN KEY (session_id) REFERENCES session (id);

ALTER TABLE session_speakers ADD CONSTRAINT fk_sesspe_on_speaker FOREIGN KEY (speakers_id) REFERENCES speaker (id);