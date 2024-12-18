/**
 * エンティティ５グリッド定義
 */

let Tb1Entity5GridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1Entity5Grid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1Entity5Grid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1Entity5Grid.entityBn'], 80, 'primaryKey numbering', null),
    Column.text('ENTITY5_MEI', Messages['Tb1Entity5Grid.entity5Mei'], 300, 'notblank', null),
    Column.cell('INSERT_TS', Messages['Tb1Entity5Grid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['Tb1Entity5Grid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['Tb1Entity5Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['Tb1Entity5Grid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1Entity5Grid.deleteF'], 30, ''),
];
