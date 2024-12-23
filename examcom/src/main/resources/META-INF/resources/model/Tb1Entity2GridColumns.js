/**
 * エンティティ２グリッド定義
 */

let Tb1Entity2GridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1Entity2Grid.sosenId'], 80, 'primaryKey numbering', 'SOSEN_MEI'),
    Column.comma('OYA_BN', Messages['Tb1Entity2Grid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1Entity2Grid.entityBn'], 80, 'primaryKey numbering', null),
    Column.text('ENTITY2_MEI', Messages['Tb1Entity2Grid.entity2Mei'], 300, 'notblank', null),
    Column.check('DELETE_F', Messages['Tb1Entity2Grid.deleteF'], 30, ''),
];
