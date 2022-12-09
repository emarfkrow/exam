/**
 * コード値マスタグリッド定義
 */

let MCodeValueGridColumns = [
    Column.refer('CODE_NM', Messages['MCodeValueGrid.codeNm'], 300, 'primaryKey', 'null'),
    Column.text('CODE_VALUE', Messages['MCodeValueGrid.codeValue'], 30, 'primaryKey', null),
    Column.text('CODE_VALUE_MEI', Messages['MCodeValueGrid.codeValueMei'], 300, '', null),
    Column.comma('HYOJI_JUN', Messages['MCodeValueGrid.hyojiJun'], 150, '', null),
    Column.text('CRITERIA', Messages['MCodeValueGrid.criteria'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MCodeValueGrid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MCodeValueGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MCodeValueGrid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MCodeValueGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MCodeValueGrid.deleteF'], 30, ''),
];
