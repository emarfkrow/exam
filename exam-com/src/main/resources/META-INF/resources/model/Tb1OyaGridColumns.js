/**
 * 親グリッド定義
 */

let Tb1OyaGridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1OyaGrid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1OyaGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.text('OYA_MEI', Messages['Tb1OyaGrid.oyaMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Tb1OyaGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb1OyaGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb1OyaGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb1OyaGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1OyaGrid.deleteF'], 30, ''),
];
