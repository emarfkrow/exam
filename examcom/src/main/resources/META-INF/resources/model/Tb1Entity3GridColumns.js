/**
 * エンティティ３グリッド定義
 */

let Tb1Entity3GridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1Entity3Grid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1Entity3Grid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1Entity3Grid.entityBn'], 80, 'primaryKey numbering', null),
    Column.text('ENTITY3_MEI', Messages['Tb1Entity3Grid.entity3Mei'], 300, 'notblank', null),
    Column.cell('INSERT_TS', Messages['Tb1Entity3Grid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['Tb1Entity3Grid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['Tb1Entity3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['Tb1Entity3Grid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1Entity3Grid.deleteF'], 30, ''),
];
