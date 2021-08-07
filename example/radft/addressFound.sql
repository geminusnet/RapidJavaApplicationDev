create or replace function addressFound 
  (first varchar2, last varchar2) 
  -- Do not name firstName and lastName. 6/4/00 YDL
  return number is
  numberOfSelectedRows number := 0;
BEGIN 

  select count(*) into numberOfSelectedRows
  from Address
  where Address.firstName = first and
    Address.lastName = last;

  return numberOfSelectedRows;
end addressFound;
/
