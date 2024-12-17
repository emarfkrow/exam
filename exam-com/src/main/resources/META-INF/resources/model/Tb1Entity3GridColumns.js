/**
 * エンティティ３グリッド定義
 */

let Tb1Entity3GridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1Entity3Grid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1Entity3Grid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1Entity3Grid.entityBn'], 80, 'primaryKey numbering', null),
    Column.text('ENTITY3_MEI', Messages['Tb1Entity3Grid.entity3Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Tb1Entity3Grid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb1Entity3Grid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb1Entity3Grid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb1Entity3Grid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1Entity3Grid.deleteF'], 30, ''),
];
